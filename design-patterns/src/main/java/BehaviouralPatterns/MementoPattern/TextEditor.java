package BehaviouralPatterns.MementoPattern;

import org.dhruv.Basics.OOPS.PaymentService;

public class TextEditor
{
    private String content;
    public void write(String text)
    {
        this.content=text;
    }
    public EditorMemento save()
    {
        return new EditorMemento(content);
    }

    public void restore(EditorMemento editorMemento)
    {
        this.content=editorMemento.getContent();
    }
    public String getContent()
    {
        return content;
    }
}
