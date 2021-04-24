import javax.sound.midi.SysexMessage;
import java.lang.invoke.SwitchPoint;
import java.util.Scanner;
import java.util.Stack;

public class Java_Stack {

    public static void main(String []argh)
    {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            Stack<String> stack = new Stack();
            String input=sc.nextLine();

            for(char c: input.toCharArray()) {
                if(stack.empty() && (c=='}' || c==')' || c==']')) {
                    stack.push(String.valueOf(c));
                    break;
                }
                if(c=='{' || c=='(' || c=='[')
                    stack.push(String.valueOf(c));
                switch (c) {
                    case '}':
                        if (stack.peek().equals("{"))
                            stack.pop();
                        else
                            stack.push("}");
                        break;
                    case ')':
                        if (stack.peek().equals("("))
                            stack.pop();
                        else
                            stack.push(")");
                        break;
                    case ']':
                        if (stack.peek().equals("["))
                            stack.pop();
                        else
                            stack.push("]");
                        break;
                }
            }
            if(stack.empty())
                System.out.println(true);
            else
                System.out.println(false);
        }

    }

    /*
    public static void main(String []argh)
    {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            Stack<String> stack = new Stack();
            String input=sc.nextLine();
            for(char c: input.toCharArray()) {
                switch (c) {
                    case '}':
                        if(!stack.empty())
                            if (stack.peek() == "{")
                                stack.pop();
                            else
                                stack.push("}");
                        else
                            stack.push("}");
                        break;
                    case ')':
                        if(!stack.empty())
                            if (stack.peek() == "(")
                                stack.pop();
                            else
                                stack.push(")");
                        else
                            stack.push(")");
                        break;
                    case ']':
                        if(!stack.empty())
                            if (stack.peek() == "[")
                                stack.pop();
                            else
                                stack.push("]");
                        else
                            stack.push("]");
                        break;
                    case '{':
                        stack.push("{");
                        break;
                    case '(':
                        stack.push("(");
                        break;
                    case '[':
                        stack.push("[");
                        break;
                }
            }
            if(stack.empty())
                System.out.println(true);
            else
                System.out.println(false);
        }
    }*/

}
