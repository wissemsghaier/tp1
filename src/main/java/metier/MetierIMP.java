package metier;

import dao.IDao;

public class MetierIMP implements IMetier {
    private IDao dao=null;

    public void setDao(IDao dao) {
        this.dao = dao;
    }
    @Override
    public double calcule() {
        double nb = dao.getValue();
        return nb * 6;
    }
}

