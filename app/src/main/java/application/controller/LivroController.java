package application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import orgn.springframework.ui.Model;

import application.model.LivroRepository;


@Controller
@RequestMapping("/Livro")
public class LivroController {

    @Autowired 
    private LivroRepository livroRepo;
    
    public String list(Model model){
        model.addAtribute("livros", livroRepo.findAll());
        return "livro/list";
    }
}