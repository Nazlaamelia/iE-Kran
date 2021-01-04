public class IeKran {

    State airBusa;
    State airDingin;
    State airNormal;
    State airPanas;
    State keranMati;
    State keranHidup;

    State state;
    public IeKran() {
        airBusa = new airBusa(this);
        airDingin = new airDingin(this);
        airNormal = new airNormal(this);
        airPanas = new airPanas(this);
        keranMati = new keranMati(this);
        keranHidup = new keranHidup(this);

        state = keranHidup;
    }

    public void volumeAir() {
        state.volumeAir();
    }

    public void jenisAir() {
        state.jenisAir();
    }

    void setState(State state) {
        this.state = state;
    }
    public State getState() {
        return state;
    }

    public State getKeranHidup() {
        return keranHidup;
    }

    public State getKeranMati() {
        return keranMati;
    }

    public State getAirBusa() {
        return airBusa;
    }

    public State getAirPanas() {
        return airPanas;
    }

    public State getAirDingin() {
        return airDingin;
    }

    public State getAirNormal() {
        return airNormal;
    }    

    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append("\nIekran.");             
        result.append("\n");
        result.append("Machine is " + state + "\n");
        return result.toString();
    }
}
