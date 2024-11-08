package org.br.senai.ProjetoSenai.controle;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



@Controller
@RequestMapping("/escola")
public class AplicacaoControle {

    @RequestMapping(value = "/contato", method = RequestMethod.GET)
    public String faleConosco() {
        return "contato";
    }

    @RequestMapping(value = "/sobre", method = RequestMethod.GET)
    public String sobrenos() {
        return "sobre";
    }

    @RequestMapping(value = "/servico", method = RequestMethod.GET)
    public String servicosdosenai() {
        return "servico";
    }

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String carregarHome() {
        return "home";
    }

}