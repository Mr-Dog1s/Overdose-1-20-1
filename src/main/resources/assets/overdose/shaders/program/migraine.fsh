#version 150

uniform sampler2D DiffuseSampler;
uniform float Time;

in vec2 texCoord;
out vec4 fragColor;

void main() {
    vec2 uv = texCoord;

    float pulse = sin(Time * 2.0) * 0.5 + 0.5;
    float blur = 0.002 + pulse * 0.003;

    vec4 color = vec4(0.0);

    color += texture(DiffuseSampler, uv);
    color += texture(DiffuseSampler, uv + vec2( blur, 0));
    color += texture(DiffuseSampler, uv + vec2(-blur, 0));
    color += texture(DiffuseSampler, uv + vec2(0, blur));
    color += texture(DiffuseSampler, uv + vec2(0,-blur));

    color /= 5.0;

    float dist = length(uv - 0.5);
    color.rgb *= 1.0 - dist * 0.35;

    fragColor = color;
}