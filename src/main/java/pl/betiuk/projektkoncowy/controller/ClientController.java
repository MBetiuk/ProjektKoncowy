package pl.betiuk.projektkoncowy.controller;

import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import pl.betiuk.projektkoncowy.model.Client;
import pl.betiuk.projektkoncowy.services.ClientService;

import javax.validation.Valid;


@RestController
@RequestMapping("/clients")
public class ClientController {



    private final ClientService clientService;

    public ClientController() {
        this(null);
    }

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }


    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String showAddClientForm (Model model){
        model.addAttribute("client", new Client());
        return "/clients/add.jsp";

    }
@RequestMapping(value = "/add", method = RequestMethod.POST)
    public String saveClient (@Valid Client client, BindingResult result){
        clientService.addClient(client);
        return "redirect:/clients/all";
    }

}
