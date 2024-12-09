
package montaine.guillaume

import de.huxhorn.sulky.ulid.ULID;
import kotlin.math.roundToInt


data class Commande(val Id: String = ULID().nextULID() ) {
    fun VendsLotManga(nbMangaVendu: Int, prixUnitaire: Double) {
        NbMangaVendu = nbMangaVendu
        PrixUnitaire = prixUnitaire
    }

    fun PrixTotal(): Double {
        val sousTotal = NbMangaVendu * PrixUnitaire * Taxe
        TotalTtc =  (sousTotal * 100).roundToInt() / 100.0
        return TotalTtc
    }

    private var PrixUnitaire: Double = 0.0
    private var NbMangaVendu: Int = 0
    var TotalTtc: Double = 0.0
    val Taxe: Double = 1.2
    val Remise: Double = 0.0
}