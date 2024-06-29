package br.com.jvs.sgce.controller;

import br.com.jvs.sgce.model.Produto;
import br.com.jvs.sgce.repository.ProdutosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class ProdutoController {
    @Autowired
    private ProdutosRepository produto;

    @GetMapping("/produtos")
    public ModelAndView listar() {
        ModelAndView mv = new ModelAndView("ListaProdutos");
        mv.addObject("produtos", produto.findAll());
        return mv;
    }
}


