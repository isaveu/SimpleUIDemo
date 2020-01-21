$input v_color0, v_texcoord0

#include "../common/common.sh"

SAMPLER2D(s_texColor,  0);

void main()
{
    vec4 c = texture2D(s_texColor, v_texcoord0) * v_color0;
    c.xyz *= c.w;
    gl_FragColor = c;
}