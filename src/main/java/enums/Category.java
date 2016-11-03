
package enums;


public enum Category {
    CUCA, FOOD, TAWA, ETHN, DRIN, BEER,
    SEDL, MUSI, CURI, PAPE,
    BEBS, LESC, HINS, HOHY, CONV,
    HAND, SHFA, WINE, VINT, VINY
}
class CatSel {

    Category cat;

    public CatSel(Category cat) {
        this.cat = cat;
    }

    public void switchMethod() {

        switch (cat) {
            case CUCA:
                oops();
                break;

            case TAWA:
                oops();
                break;
            case ETHN:
                oops();
                break;
            case DRIN:
                oops();
                break;
            case BEER:
                oops();
                break;
            case SEDL:
                oops();
                break;
            case MUSI:
                oops();
                break;
            case CURI:
                oops();
                break;
            case PAPE:
                oops();
                break;
            case BEBS:
                oops();
                break;
            case LESC:
                oops();
                break;
            case HINS:
                oops();
                break;
            case HOHY:
                oops();
                break;
            case CONV:
                oops();
                break;
            case HAND:
                oops();
                break;
            case SHFA:
                oops();
                break;
            case WINE:
                oops();
                break;
            case VINT:
                oops();
                break;
            case VINY:
                oops();
                break;

            default:
                System.out.println("");
                break;
        }
    }

    private void oops() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}



