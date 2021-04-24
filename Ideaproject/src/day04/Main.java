package day04;

/**
 * Created by Enzo Cotter on 2021/4/12.
 */
public class Main {
         

            public static void main(String[] args) {
         

               databaseFactory daFactory = null;

               Connection connection ;

        Statement statement;

        try{
        daFactory=(databaseFactory)XMLUtil.getBean();

        }catch(Exceptione){
        e.printStackTrace();
        }



        if(daFactory==null){
        System.out.println("未获取到对象");

        }else{
        connection=daFactory.createConnection();

        statement=daFactory.createStatement();

        connection.connection();

        statement.sattement();

       }

        }

        }

