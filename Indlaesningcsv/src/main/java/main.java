import processing.core.PApplet;
import processing.data.Table;
import processing.data.Table;
import java.util.ArrayList;

public class main extends PApplet {
    String[] data;
    String[] navne = {"Lea","Adam","Anders","Andrea","Camilla","Casper"};
    int[] karaktere = {-3,0, 2, 4, 7, 10, 12};
    ArrayList<String> list = new ArrayList<String>();
    ArrayList<Elev> elevList = new ArrayList<Elev>();

    public static void main(String[] args) { PApplet.main("main"); }

    @Override
    public void setup() {
        opgA();
        opgB();
        opgC();
        }


        public void opgC() {
            println(" ------------------------------------------------------------- \n" +
                    "                 Opgave: C                       " +
                    "\n -------------------------------------------------------------");
            for (int i = 0; i < 5; ++i) {
                if(i == 0){
                    elevList.add(new Elev(this, navne[i], karaktere[6]));
                } else {
                    elevList.add(new Elev(this, navne[i],karaktere[(int)random(0,6)] ));
                }

                elevList.get(i).udskriv();

            }
        }


        public void opgB() {
            println(" ------------------------------------------------------------- \n" +
                    "                 Opgave: B                       " +
                    "\n -------------------------------------------------------------");
            for(int i = 0; i < 10; ++i){
                int y = i +1;
                String str = Integer.toString(y);
                list.add(str);
            }

            for(int i = 0; i < list.size(); ++i) {
                println("element " + i + " = " + list.get(i));
            }

        }

        public void opgA(){

            println(" ------------------------------------------------------------- \n" +
                    "                 Opgave: A                       " +
                    "\n -------------------------------------------------------------");

            String[] data = loadStrings("business (1).csv");

            for (int i = 0 ; i < data.length; i++) {
                println(data[i]);
            }


            println(" ------------------------------------------------------------- \n" +
                    "                 der kun printer tallene ud                        " +
                    "\n -------------------------------------------------------------");

            for (int i = 1 ; i < data.length; i++) {
                String s = data[i].substring(1,data[i].length()-1);

                String[] value = s.split(",");
                println(value[1] + " " + value[value.length - 2]+ " " + value[value.length - 1]);

            }
        }
    }


