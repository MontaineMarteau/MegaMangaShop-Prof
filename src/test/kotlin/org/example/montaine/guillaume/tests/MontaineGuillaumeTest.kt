
package org.example.montaine.guillaume.tests

import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.matchers.shouldBe
import montaine.guillaume.Commande

class MontaineGuillaumeTest: BehaviorSpec({

    context(
            "Calcul du prix d'une commande simple en France") {
        val commande = Commande()

        //Exemples - Règle: Calcul standard avec nombres entiers
        given("je vends 5 mangas à 10€ chacun "){

            commande.VendsLotManga( 5, 10.0)

            When("je calcule le prix total"){
                val prixTotal = commande.PrixTotal()

                Then("le prix total est de 60"){
                    prixTotal shouldBe 60.0
                }
            }
        }

        given("je vends 3 mangas à 20€ chacun "){

            commande.VendsLotManga( 3, 20.0)

            When("je calcule le prix total"){
                val prixTotal = commande.PrixTotal()

                Then("le prix total est de 72"){
                    prixTotal shouldBe 72
                }
            }
        }

        //
        given("je vends 3 mangas à 9.99€ chacun "){

            commande.VendsLotManga( 3, 9.99)

            When("je calcule le prix total"){
                val prixTotal = commande.PrixTotal()

                Then("le prix total est de 35.64"){
                    prixTotal shouldBe 35.64
                }
            }
        }

        given("je vends 7 mangas à 19.99€ chacun "){

            commande.VendsLotManga( 7, 19.99)

            When("je calcule le prix total"){
                val prixTotal = commande.PrixTotal()

                Then("le prix total est de  167.92"){
                    prixTotal shouldBe 167.92
                }
            }
        }

    }})