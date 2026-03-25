
class Fila:
    def __init__(self):
        # Inicializa a fila como lista vazia
        self.fila = []

    # Inserção -- enqueue
    def enqueue(self, item):
        self.fila.append(item)

    # Remoção -- dequeue
    def dequeue(self):
        if not self.is_empty():
            return self.fila.pop(0)
        return None

    # Consulta do 1º elemento -- front
    def front(self):
        if not self.is_empty():
            return self.fila[0]
        return None

    # Ver se a fila está vazia
    def is_empty(self):
        return len(self.fila) == 0


if __name__ == "__main__":
    fila = Fila()
    fila.enqueue(1)
    fila.enqueue(2)
    fila.enqueue(3)
    fila.enqueue(4)
    fila.enqueue(5)
    fila.enqueue(6)

    print("Front:", fila.front())
    print("1º a sair:", fila.dequeue())
    print("Está vazia?:", fila.is_empty())
