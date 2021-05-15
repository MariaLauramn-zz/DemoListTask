package com.example.demolisttask;

@RestController
public class ListaController {

    private List<tarea> lista;

    public ListaController() {
        lista = new ArrayList<>();
    }

    @GetMapping("/lista")
    public List<tarea> todas() {
        return lista;
    }

    @PostMapping("/lista")
    public RedirectView addNewTarea(tarea param) {
        lista.add(param);
        return new RedirectView("/"); //devuelve la misma vista por defecto
    }