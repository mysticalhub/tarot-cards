# Tarot Card API

> Warning: Never play poker with Tarot cards...
I got a full house once and 4 people died. It's a joke.
> For all your cybermysticism needs. 🔮

Provides information parsed from AE Waite's The Pictorial Key to the Tarot, meeting the OpenAPI 3 spec. This was created as a friendly introduction to REST APIs.

---

## API Usage

1. [See full documentation + play with the API on SwaggerHub](https://app.swaggerhub.com/apis/)

2. See below for quick start

### Quick start
Will be in the docker

### Condensed documentation

| GET path                      | Result                                  | Params                                                                                                          |
| :---------------------------- | --------------------------------------- | :-------------------------------------------------------------------------------------------------------------- |
| `/api/v1/cards` | return all cards                        |                                                                                                                 |
| `/api/v1/cards/:name_short`   | return card with specified `name_short` | 
| `/api/v1/cards/search`        | search all cards                        |                                                             |
| `/api/v1/cards/random`        | get random card(s)                      | _optional_ `n={integer <= 78}`                                                                                  |

### Examples:

Get 10 random cards:

https://localhost:8080/api/v1/cards/random?n=10

## 🗞 Updates

### 27/10/2022

- Start project

