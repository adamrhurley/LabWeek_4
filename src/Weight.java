public class Weight {
    private int stones;
    private int pounds;

    public Weight()
    {
        stones = 0;
        pounds = 0;
    }

    public Weight(int stones,int pounds)
    {
        setStones(stones);
        setPounds(pounds);
    }

    private void setPounds(int pds) { pounds = pds;}

    private void setStones(int stns){stones = stns;}


    public void setWeight(int stones, int pounds) {
        setStones(stones);
        setPounds(pounds);
    }

    @Override
    public String toString() {
        return stones + " st " + pounds + " lb";
    }

}

