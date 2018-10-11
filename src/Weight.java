public class Weight {
    private int stones;
    private int pounds;

    public Weight()
    {
        stones = 0;
        pounds = 0;
    }

    public Weight(int stns,int pds)
    {
        setStones(stns);
        setPounds(pds);
    }

    private void setPounds(int pds) { pounds = pds;}

    private void setStones(int stns){stones = stns;}


    public void setWeight(int stones, int pounds) {
        setStones(stones);
        setPounds(pounds);
    }

    @Override
    public String toString() {
        return stones + " St " + pounds + " lb";
    }

}

