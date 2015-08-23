package com.example.ormlite.ormexemple.BL;

import com.example.ormlite.ormexemple.DAO.DatabaseHelper;
import com.example.ormlite.ormexemple.DAO.PessoaDao;
import com.example.ormlite.ormexemple.Entity.Pessoa;
import com.example.ormlite.ormexemple.Interfaces.IPessoaDao;

import org.androidannotations.annotations.Bean;
import org.androidannotations.annotations.EBean;
import org.androidannotations.annotations.OrmLiteDao;

import java.sql.SQLException;

/**
 * Created by domin on 23/08/2015.
 */
@EBean
public class PessoaBL {

    @OrmLiteDao(helper = DatabaseHelper.class)
    public IPessoaDao pessoaDao;
}
