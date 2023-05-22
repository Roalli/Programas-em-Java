public class RPG4 {
   public static int atributo(){ //Função que irá retornar um valor para os atributos.
                                 //rolando numeros aleatorios como se fosse com dados, ao estilo 
                                 //de um jogo de rpg.
        
       int dado1,dado2,dado3,dado4,res;

        dado1=(int)(1+Math.random()*6);
        dado2=(int)(1+Math.random()*6);
        dado3=(int)(1+Math.random()*6);
        dado4=(int)(1+Math.random()*6);
        res=dado1+dado2+dado3+dado4;
        int menor=Math.min(dado1,dado2);
        menor=Math.min(menor,dado3);
        menor=Math.min(menor,dado4);
        res-=menor;
        return res;
   }
   public static int mod(int num){//Função que com a variavel do atributo, retorna o valor do
                                  //modificador do atributo.
        switch(num){
            case 1:num=-5;break;
            case 2:num=-4;break;
            case 3:num=-4;break;
            case 4:num=-3;break;
            case 5:num=-3;break;
            case 6:num=-2;break;
            case 7:num=-2;break;
            case 8:num=-1;break;
            case 9:num=-1;break;
            case 10:num=0;break;
            case 11:num=0;break;
            case 12:num=1;break;
            case 13:num=1;break;
            case 14:num=2;break;
            case 15:num=2;break;
            case 16:num=3;break;
            case 17:num=3;break;
            case 18:num=4;break;
            case 19:num=5;break;
            case 20:num=5;break;
        }
        return num;
   }
   public static void main(String[] args){
        int[][] Atrib=new int[7][2];//usado um vetor para os atributos, o primeiro ira separar qual
                                    //o atributo que estara lidando, que ira ser a Força, Destreza, 
                                    //Constituição, Inteligencia, Sabedoria, Carisma e a sorte. 
                                    //E o segundo ira armazenar o valor do modificador do tal 
                                    //atributo.
        
        for(int cont=0;cont<=6;cont++){//Um laço usado para colocar valor zero na variavel.
            Atrib[cont][0]=0;
            }
        
         

          
        for(int cont=0;cont<=6;cont++){
            Atrib[cont][0]+=atributo();
            Atrib[cont][1]=mod(Atrib[cont][0]);
        }
       


        System.out.printf("\n\n\n----------Os atributos---------\n\nFor:%d\nmod:%d\n\nDes:%d\nmod:%d\n\nCon:%d\nmod:%d\n\nInt:%d\nmod:%d\n\nSab:%d\nmod:%d\n\nCar:%d\nmod:%d\n\nSor:%d\nmod:%d\n\n",Atrib[0][0],Atrib[0][1],Atrib[1][0],Atrib[1][1],Atrib[2][0],Atrib[2][1],Atrib[3][0],Atrib[3][1],Atrib[4][0],Atrib[4][1],Atrib[5][0],Atrib[5][1],Atrib[6][0],Atrib[6][1]);
   }
}
