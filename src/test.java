import java.util.Stack;

public class test {
    public static void main(String[] args) {
        String origin = "(–b+(b^2–4*a*c)^(0.5/2*a)) ";
        Stack<Integer> stack = new Stack<>();
        for (int i = 0;i < origin.length();i++){
            if (origin.charAt(i) == '('){
                stack.push(i);
            }else if (origin.charAt(i) == ')'){
                if (!stack.isEmpty()){
                    stack.pop();
                } else {
                    stack.push(i);
                }
            }
        }
        if (stack.empty()){
            System.out.println("true");
        }else {
            System.out.println("false");
        }
    }
}
