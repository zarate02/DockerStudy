<pre><code>
docker run \
--restart=always \
-d --name emqx \
-p 1883:1883 \
-p 8083:8083 \
-p 4369:4369 \
-p 7369-7379:7369-7379 \
-p 18083:18083 \
-e EMQX_NAME=emqx69 \
-e EMQX_HOST=192.168.1.69 \
-e EMQX_NODE__NAME=emqx69@192.168.1.69 \
-e EMQX_CLUSTER__NAME=emqxcl \
-e EMQX_CLUSTER__DISCOVERY=static \
-e EMQX_CLUSTER__STATIC__SEEDS=emqx78@192.168.1.78,emqx69@192.168.1.69 \
-e EMQX_LOADED_PLUGINS="emqx_recon,emqx_retainer,emqx_management,emqx_dashboard,emqx_auth_username" \
-e EMQX_NODE__DIST_LISTEN_MIN=7369 \
-e EMQX_NODE__DIST_LISTEN_MAX=7379 \
-e EMQ_NODE__COOKIE=ef16498f66804df1cc6172f6996d5492 \
emqx/emqx:v3.2.2
</pre></code>
