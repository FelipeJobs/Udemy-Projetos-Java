package projetosudemy.poo;

public class Data {
            String dia ;
            String mes ;
            String ano ;

            Data(){
                dia = "01";
                mes = "01";
                ano = "1970";

            }

            Data(String d , String m, String a){
                dia = d;
                mes = m;
                ano = a;

            }

            String DataFormatada(){
                return dia +"/" + mes +"/" + ano;
                /*
                    Poderia ser feito dessa forma tb.
                   return String.format("%s/%s/%s",dia,mes,ano);
                 */}


}

