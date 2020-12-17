package iram.sgbd.patterns.dao.impl;

import iram.sgbd.model.Prescription;
import iram.sgbd.patterns.dao.AbstractDao;

import java.util.List;

public class PrescriptionDao extends AbstractDao<Prescription> {
    @Override
    protected boolean insert(Prescription prescription) {
        return false;
    }

    @Override
    protected Prescription update(Prescription prescription) {
        return null;
    }

    @Override
    protected boolean delete(Prescription prescription) {
        return false;
    }

    @Override
    protected List<Prescription> selectAll(String s) {
        return null;
    }

    @Override
    protected Prescription selectById(int id) {
        return null;
    }
}
