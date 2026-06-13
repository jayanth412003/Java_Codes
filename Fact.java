class Fact{
    public static void Main(String args[]){
        int n=5;
        int fact=1;
        for (int i = 1; i <=n; i++){
            fact=fact*i;
        }
        System.out.println("Fact="+ fact);
    }
}