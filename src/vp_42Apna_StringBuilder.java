public class vp_42Apna_StringBuilder{
    public static void main(String[] args){
        StringBuilder exam = new StringBuilder("Tony");

        System.out.println(exam);

        //char at index
        System.out.println(exam.charAt(0));

        //set char at index 0
        exam.setCharAt(0, 'S');
        System.out.println(exam);

        //insert
        exam.insert(3, 'u');
        System.out.println(exam);

        //delete
        exam.delete(4, 5);
        System.out.println(exam);

        //append
        exam.append(5);
        System.out.println(exam);


    }
}