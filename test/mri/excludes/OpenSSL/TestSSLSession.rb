exclude :test_client_session, "HANGS"
exclude :test_ctx_client_session_cb, "session_new_cb= not supported"
exclude :test_ctx_server_session_cb, "session_get_cb= not supported"
exclude :test_server_session, "HANGS"
exclude :test_session, "HANGS"
exclude :test_session_equals, "OpenSSL::SSL::Session.new not implemented"
exclude :test_session_time, "OpenSSL::SSL::Session.new not implemented"
exclude :test_session_timeout, "OpenSSL::SSL::Session.new not implemented"
exclude :test_session_exts_read, "OpenSSL::SSL::Session.new not implemented"