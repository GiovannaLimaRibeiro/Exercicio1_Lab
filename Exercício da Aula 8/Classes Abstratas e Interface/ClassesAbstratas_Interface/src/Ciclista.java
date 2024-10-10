public class Ciclista extends Atleta implements Equipamento{
    @Override
    public void treinar(){
        System.out.println("Treino de ciclismo: pedalar 15km a em um tempo de 30min...");
    }

    @Override
    public void colocarEquipamento(){
        System.out.println("Colocando tênis, óculos e roupa...");
    }

}
