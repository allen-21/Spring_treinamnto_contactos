package com.Desafios.Desafios.Service;

import com.Desafios.Desafios.models.ContactoModel;
import com.Desafios.Desafios.repository.ContactoRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class ContactoService {
    @Autowired
    private ContactoRepository contactoRepository;

    //Criar
    @Transactional
    public ResponseEntity<?> create (ContactoModel contactoModel){
        Random random = new Random();
        contactoModel.setTelefone(gerarNumero(random));
        return new ResponseEntity<ContactoModel>(contactoRepository.save(contactoModel), HttpStatus.CREATED);
    }

    public Iterable<ContactoModel> listar(){
        return contactoRepository.findAll();
    }

    public static String gerarNumero(Random random) {

        String[] prefixos = {"82", "84", "85", "86", "87"};
        String prefixo = prefixos[random.nextInt(prefixos.length)];
        String numero = String.format("%07d", random.nextInt(10000000));
        return prefixo + numero;
    }
}
