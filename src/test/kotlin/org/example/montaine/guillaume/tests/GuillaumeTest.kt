
package org.example.montaine.guillaume.tests

import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.matchers.shouldNotBe
import montaine.guillaume.Commande

class GuillaumeTest : BehaviorSpec({

    context("je veux vérifier que chaque ticket a son identifiant unique") {

        given("un ticket") {
            val ticket = Commande()

            And("un 2e ticket") {
                val ticket2 = Commande()

                When("je lis les 2 identifiants") {
                    val id1 = ticket.Id
                    val id2 = ticket2.Id

                    Then("ce n'est pas le même") {
                        id1 shouldNotBe id2
                    }

                }
            }
        }
    }})