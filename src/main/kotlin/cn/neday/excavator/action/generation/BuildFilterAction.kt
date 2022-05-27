package cn.neday.excavator.action.generation

class BuildFilterAction : BaseGenerationAnAction() {
    override val cmd = "packages pub run build_runner build --build-filter='lib/states/auth/backend_settings_state.dart**'"
    override val title = "Building Filter"
    override val successMessage = "Complete!\nRunning build successfully."
    override val errorMessage = "Could not running build!"
}