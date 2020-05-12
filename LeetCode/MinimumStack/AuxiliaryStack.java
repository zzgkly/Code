import java.util.Stack;

public class AuxiliaryStack
{

    public static void main(String[] args)
    {

    }
}



class MinStack
{
    //初始化数据栈和辅助栈
    private Stack<Integer> dataStack;
    private Stack<Integer> minStack;

    public MinStack()
    {
        dataStack = new Stack<>();
        minStack = new Stack<>();
    }


    //push操作，需要保持minStack的栈顶为最小栈
    public void push(int x)
    {
        dataStack.push(x);
        if(minStack.isEmpty() || x <= minStack.peek())
        {
            minStack.push(x);
        }
    }


    //如果此次pop的元素是当前最小值，则需要minStack栈顶元素也pop出
    public void pop()
    {
        int x = dataStack.pop();
        if(x == minStack.peek())
        {
            minStack.pop();
        }
    }


    //top操作，返回数据栈的栈顶元素
    public int top()
    {
        return dataStack.peek();
    }

    //getMin，返回辅助栈的栈顶元素
    public int getMin()
    {
        return minStack.peek();
    }
}
