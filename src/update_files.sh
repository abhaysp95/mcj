#!/usr/bin/env bash

# login.fxml
rsync /opt/SceneBuilder/app/login.fxml ~/Downloads/git-materials/my_repos/mcj/src/com/mcj
rsync /opt/SceneBuilder/app/login.fxml ~/Downloads/git-materials/my_repos/mcj/bin/com.mcj/com/mcj

# client.fxml
rsync /opt/SceneBuilder/app/client.fxml ~/Downloads/git-materials/my_repos/mcj/src/com/mcj
rsync /opt/SceneBuilder/app/client.fxml ~/Downloads/git-materials/my_repos/mcj/bin/com.mcj/com/mcj


# login.fxml
rsync ~/Downloads/git-materials/my_repos/mcj/src/com/mcj/login.fxml /opt/SceneBuilder/app
rsync ~/Downloads/git-materials/my_repos/mcj/src/com/mcj/login.fxml ~/Downloads/git-materials/my_repos/mcj/bin/com.mcj/com/mcj

# client.fxml
rsync ~/Downloads/git-materials/my_repos/mcj/src/com/mcj/client.fxml /opt/SceneBuilder/app
rsync ~/Downloads/git-materials/my_repos/mcj/src/com/mcj/client.fxml ~/Downloads/git-materials/my_repos/mcj/bin/com.mcj/com/mcj
