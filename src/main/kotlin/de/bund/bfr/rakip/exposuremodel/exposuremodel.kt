package de.bund.bfr.rakip.exposuremodel

import de.bund.bfr.rakip.generic.*

data class ExposureModel(
        var generalInformation: GeneralInformation,
        var scope: Scope,
        var dataBackground: DataBackground? = null,
        var modelMath: ModelMath,
        var simulation: Simulation? = null
)
data class Scope(
        var product: Product,
        var hazard: Hazard,
        var populationGroup: PopulationGroup,
        var generalComment: String? = null,
        var temporalInformation: String? = null,
        val region: MutableList<String> = mutableListOf(),
        val country: MutableList<String> = mutableListOf()
)