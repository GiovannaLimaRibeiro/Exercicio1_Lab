public class Corredor extends Atleta implements Equipamento{

    @Override
    public void treinar(){
        System.out.println("Treino de corrida: correr 5km a um passe de 4.55min...");
    }

    @Override
    public void colocarEquipamento(){

        System.out.println("Colocando tênis, óculos e roupa...");
    }

}
