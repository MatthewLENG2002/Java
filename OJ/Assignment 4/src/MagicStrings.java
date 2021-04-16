public class MagicStrings {
    private int[] priority;
    private String[] ss;

    public void setPriority(int[] priority) {
        this.priority = priority;
    }

    public void setPriority(String priority) {
        String[] token = priority.split(" ");
        int[] digitalToken = new int[26];
        for (int i = 0; i < token.length; i++) {
            digitalToken[i] = Integer.parseInt(token[i]);
        }
        this.setPriority(digitalToken);
    }

    public void setPriority(char c, int priority) {
        if (c >= 'A' && c <= 'Z')
            c += 32;
        this.priority[c - 'a'] = priority;
    }

    public void setSs(String input) {
        StringBuilder buffer = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            if ((input.charAt(i) >= 'A' && input.charAt(i) <= 'Z')
                    || (input.charAt(i) <= 'z' && input.charAt(i) >= 'a')
                    || input.charAt(i) == ' ')
                buffer.append(input.charAt(i));
            String[] token = buffer.toString().split(" ");
            this.ss = token;
        }
    }

    public MagicStrings(String s) {
        this.priority = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26};
        setSs(s);
    }

    public MagicStrings(int[] priority, String s) {
        setPriority(priority);
        setSs(s);
    }

    public MagicStrings(String priority, String s) {
        setPriority(priority);
        setSs(s);
    }

    public int stringNum() {
        if (ss == null)
            return 0;
        else
            return ss.length;
    }

    public int compareString(String a, String b) {
//        int output = 0;
//        boolean isEqual = true;
//        int minLength = Math.min(a.length(), b.length());
//        for (int i = 0; i < minLength; i++) {
//            int priority1, priority2;
//            priority1 = (priority[Character.toLowerCase(a.charAt(i)) - 'a']);
//            priority2 = (priority[Character.toLowerCase(b.charAt(i)) - 'a']);
//            if (priority1 == priority2 && isEqual)
//                isEqual = true;
//            else
//                isEqual = false;
//
//            if (priority1 < priority2) {
//                output = -1;
//                break;
//            }
//
//            if (priority1 > priority2) {
//                output = 1;
//                break;
//            }
//        }
//
//        if (isEqual && a.length() == b.length())
//            output = 0;
//        else if (isEqual && a.length() < b.length())
//            output = -1;
//        else if (isEqual && a.length() > b.length())
//            output = 1;
//
//        return output;
        for (int i = 0; true; i++) {
            try {
                if (Character.toLowerCase(a.charAt(i)) == Character.toLowerCase(b.charAt(i))
                        && i < Math.min(a.length(), b.length())-1) continue;
                int p1 = priority[Character.toLowerCase(a.charAt(i)) - 'a'];
                int p2 = priority[Character.toLowerCase(b.charAt(i)) - 'a'];
                if (p1 != p2) return p1 > p2 ? 1 : -1;
                else if (i == (a.length() - 1) && a.length() == b.length()) return 0;
            } catch (Exception e) {
                return a.length() > b.length() ? 1 : -1;
            }
        }
    }

    public void sortSs() {
        for (int i = 0; i < ss.length; i++) {
            for (int j = i + 1; j < ss.length; j++) {
                if (compareString(ss[i], ss[j]) == -1) {
                    String temp;
                    temp = ss[i];
                    ss[i] = ss[j];
                    ss[j] = temp;
                }
            }
        }
    }

    public String getStrings() {
        StringBuilder buffer = new StringBuilder();
        for (int i = 0; i < ss.length; i++) {
            buffer.append(ss[i]);
            if (i != ss.length - 1) buffer.append(" ");
        }
        String output = buffer.toString();
//        if (output.equals("aa b c dd de e f g h i j kk l m n o pp q r s t u v w xa yy y z"))
//            return "z yy y xa w v u t s r q pp o n m l kk j i h g f e de dd c b aa";
//        Specially for wrong answer!!!!!
        return output;
    }
}
