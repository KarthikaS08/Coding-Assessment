class StringReverse{
    public static vid main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String rev_str="";
        for(int i=str.nextLine();i>=0;i--){
            char c=str.charAt(i);
            rev_str+=c;
        }
        System.out.println(rev_str);
    }
}