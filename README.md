# Diagrama de Classes Iphone

```mermaid
classDiagram
    class ReprodutorMusical {
        <<interface>>
        +tocar(): void
        +pausar(): void
        +selecionarMusica(): void
    }

    class AparelhoTelefonico {
        <<interface>>
        +ligar(): void
        +atender(): void
        +iniciarCorreioVoz(): void
    }

    class NavegadorInternet {
        <<interface>>
        +exibirPagina() void
        +adicionarNovaAba(): void
        +atualizarPagina(): void
    }

    class IPhone {
        -modelo: String
        -cor: String
        -memoriaGB: int
        +IPhone(modelo: String, cor: String, memoriaGB: int)
        +exibirDetalhes(): void
        +tocar(): void
        +pausar(): void
        +selecionarMusica(): void
        +ligar(): void
        +atender(): void
        +iniciarCorreioVoz(): void
        +exibirPagina(): void
        +adicionarNovaAba(): void
        +atualizarPagina(): void
    }

    IPhone --|> ReprodutorMusical
    IPhone --|> AparelhoTelefonico
    IPhone --|> NavegadorInternet
