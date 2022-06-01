public class BonusMilesService {
    public int calculate( int cost){
        int price;
        if (cost >= 20){
            price = cost / 20;
        }else {
            price = 0;
        }
        return price;

    }
}
