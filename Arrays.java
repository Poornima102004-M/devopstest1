class Arrays{
    public static void main(String[] args) {
        String[] kingdom={"Mexico","Wessex","Northumbria","Esat Anglia"};
        System.out.println(kingdom[2]);
        int[] numbers={1,2,3,4};
        for(int num:numbers){
            System.out.println(num);
        }
        for(int i=0;i<numbers.length;i++){
            System.out.println(numbers[i]);
        }
        int[] grades={98,56,78,97};
        for(int i=0;i<grades.length;i+=2){
            System.out.println(grades[i]);
        }
        int[] doub={2,3,4};
        for(int i=0;i<doub.length;i++){
            System.out.println(doub[i]*2);
        }
        String[] colors={"red","blue"};
        for(int i=0;i<colors.length;i++){
            colors[i]=colors[i].toUpperCase();
        }
        }
               
    }
