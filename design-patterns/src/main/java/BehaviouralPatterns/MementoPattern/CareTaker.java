package BehaviouralPatterns.MementoPattern;

import java.util.Stack;

public class CareTaker
{
    private final Stack<EditorMemento> st=new Stack<>();
    public void saveState(TextEditor editor)
    {
        st.push(editor.save());
    }
    public void undo(TextEditor editor)
    {
        if(!st.isEmpty())
            st.pop();
        editor.restore(st.peek());
    }
}
