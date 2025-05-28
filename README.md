# Microservices Architecture Diagram

```mermaid
flowchart TB
    subgraph Client
        NextJSApp[Next.js App]
    end

    subgraph Gateway["API Gateway (Swagger UI)"]
    end

    subgraph Eureka["Eureka Server (Service Registry)"]
    end

    subgraph Services["Microservices"]
        AutoInsurance[AutoInsurance:8084]
        HomeInsurance[HomeInsurance:8089]
        LifeInsurance[LifeInsurance:8082]
        PetHealthInsurance[PetHealthInsurance:8081]
        Sellermodule[Sellermodule:8083]
    end

    NextJSApp --> Gateway
    Gateway --> Eureka
    Eureka --> AutoInsurance
    Eureka --> HomeInsurance
    Eureka --> LifeInsurance
    Eureka --> PetHealthInsurance
    Eureka --> Sellermodule
