package supermarket.item


import grails.rest.*
import grails.converters.*

class ItemController extends RestfulController {

    static responseFormats = ['json', 'xml']

    ItemController() {
        super(Item)
    }

    def acomprar() {
        respond Item.findAllByQuantidadeGreaterThan(0), view: 'index'
    }

}
