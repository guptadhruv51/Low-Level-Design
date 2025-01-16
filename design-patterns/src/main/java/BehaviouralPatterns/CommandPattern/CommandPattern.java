package BehaviouralPatterns.CommandPattern;
interface Command
{
    void execute();
}

class BoldCommand implements  Command
{
    private TextEditor textEditor;

            BoldCommand(TextEditor textEditor)
            {
                this.textEditor=textEditor;
            }
            @Override
            public void execute()
            {
                textEditor.boldText();

            }
}
class Button
{
    private Command command;
    public void setCommand(Command command)
    {
        this.command=command;
    }
    public void click()
    {
        command.execute();
    }
}
class TextEditor {
    public void boldText() {
        System.out.println("Text has been bolded.");
    }

    public void italicizeText() {
        System.out.println("Text has been italicized.");
    }

    public void underlineText() {
        System.out.println("Text has been underlined.");
    }
}
public class CommandPattern
{
    public static void main(String[] args)
    {

        TextEditor editor=new TextEditor();
        Button button=new Button();
        button.setCommand(new BoldCommand(editor));
        button.click();

    }

}
