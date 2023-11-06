package application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

import application.model.GeneroRepository;
import application.model.LivroRepository;


@Controller
@RequestMapping("/Livro")
public class LivroController {
    @Autowired 
    private LivroRepository livroRepo;
    @Autowired
    private GeneroRepository generoRepo;
    
    @RequestMapping("/list")
    public String list(Model model){
        model.addAttribute("livros", livroRepo.findAll());
        return "livro/list";
    }

    @RequestMapping("/insert")
    public String insert(){

        return "livro/insert";
    }
}