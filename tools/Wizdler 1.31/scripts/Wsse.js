define(["require","exports","crypto-js/enc-base64","crypto-js/enc-hex","crypto-js/enc-latin1","crypto-js/sha1"],function(s,e,o,t,r,n){function i(){for(var s=40,e="0123456789abcdef",r=new Array(s),n=0;s>n;++n)r[n]=e[0|16*Math.random()];return t.parse(r.join("")).toString(o)}function a(s,e,i){return n(t.parse(o.parse(s).toString()+r.parse(e.toISOString()+i))).toString(o)}e.NS={wsse:"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd",wsu:"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd"},e.PasswordType={text:"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-username-token-profile-1.0#PasswordText",digest:"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-username-token-profile-1.0#PasswordDigest"},e.generateNonce=i,e.generateDigest=a});