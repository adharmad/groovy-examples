// Get all installed providers

import java.security.*

providers = Security.getProviders()

providers.each { p ->
    println "${p.name} ${p.version}"
}
