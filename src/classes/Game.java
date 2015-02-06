package classes;

/**
 * Created by root on 5/02/15.
 */
public class Game {

    int[] rolls = new int[21];
    int tiro=0;
    int total=0;

    public int getTiro() {
        return tiro;
    }

    public void setTiro(int tiro) {
        this.tiro = tiro;
    }



    public Game(){
        for (int n=0;n<21;n++)
        {

               roll(0);
        }
        this.tiro=0;
    }


    public void roll (int pins){
        rolls[tiro++] = pins;
        }


    public int score () {
        int indiceRoll =0;
        //recoremos Frames del juego
        for (int frame=0;frame<10;frame ++) {

             if (isStrike(indiceRoll))
                    total+=10+  addStrikeBono(indiceRoll, frame);
                else if(isSpare(indiceRoll))
                    total+=10 + addSpareBono(indiceRoll);
                    else
                    total+= addNormalPuntos(indiceRoll);
            //Al tener dos roll cada frame se incrementa el indice en 2
            indiceRoll +=2;
        }
        return  total;

    }

    /*
     * @param indiceRoll el indice del roll que se desea conocer si es Strike
     */
    public boolean isStrike(int indiceRoll){
            if  (rolls[indiceRoll] ==10)
            {
                return  true   ;
            }
        return false;
    }

    /*
    * @param indiceRoll el indice del primer roll del frame del que se desea conocer si es Spare
    */
    public boolean isSpare(int indiceRoll)
    {
        return rolls[indiceRoll] + rolls[indiceRoll +1] >=10 ;
    }

    /*
   * @param indiceRoll el indice de roll del frame que genera el Strike
   * @param indiceFrame el indice  del Frame del que se calculara el bono
   */
    public  int addStrikeBono(int indiceRoll, int indiceFrame) {
        if (isFinalframe(indiceFrame))
            //agregamos para bono los dos ultimos tiros 20 y 21
            return rolls[indiceRoll +1] +  rolls[indiceRoll +2];
        else
            if (isStrike(rolls[indiceRoll + 2]))
                 //al ser er un Strike el siguiente Frame se tomara el primer tiro del segundo frame siguiente
                return  rolls[indiceRoll +2]+ rolls[indiceRoll +4];
            else
                return  rolls[indiceRoll +2] + rolls[indiceRoll +3];
    }

    /*
    * @param indiceFrame el indice del Frame
    */
    public boolean isFinalframe (int indiceFrame)
    {
        if  (indiceFrame ==9 )
        {
            return  true   ;
        }
        return false;
    }

    /*
    * @param indiceRoll el indice del primer roll del Frame
    */
    public int addNormalPuntos(int indiceRoll){
        return rolls[indiceRoll] + rolls[indiceRoll +1];
    }

    /*
    * @param indiceRoll el indice del primer roll del Frame genera el spare
    */
    public  int addSpareBono(int indiceRoll){
        return rolls[indiceRoll+2];
    }


}