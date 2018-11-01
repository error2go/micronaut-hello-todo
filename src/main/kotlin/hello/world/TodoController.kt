package hello.world

import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.MediaType

@Controller("/todo")
class TodoController {

    @Get(produces = [MediaType.APPLICATION_JSON])
    fun index(): List<Todo> {
        return listOf(Todo(1,"test"))
    }
}