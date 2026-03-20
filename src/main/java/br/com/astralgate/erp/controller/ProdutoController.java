package br.com.astralgate.erp.controller;

import br.com.astralgate.erp.entity.Produto;
import br.com.astralgate.erp.repository.ProdutoRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produto")
public class ProdutoController {

@Autowired
private ProdutoRepository produtoRepository;

   @GetMapping("/listar")
   public List<Produto> listarTodos() {
      return  produtoRepository.findAll();
   }

}
