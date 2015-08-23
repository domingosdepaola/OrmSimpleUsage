package com.example.ormlite.ormexemple.Interfaces;

import com.example.ormlite.ormexemple.DAO.PessoaDao;
import com.example.ormlite.ormexemple.Entity.Pessoa;
import com.j256.ormlite.dao.Dao;

import org.androidannotations.annotations.Bean;

import java.util.List;

/**
 * Created by domin on 23/08/2015.
 */
public interface IPessoaDao extends Dao<Pessoa,Integer> {
    List<Pessoa> findAllPeople();
    boolean savePeople(Pessoa pessoa);
}
