// entry=0x93dd4

ulong H93dd4(ulong param_1)

{
  ulong uVar1;
  ulong uVar2;
  
  uVar2 = (long)param_1 >> ((-DAT_0027a358 | 0xd061U) * 2 - (-DAT_0027a358 ^ 0xd061U) & 0x3f);
  uVar2 = ((uVar2 ^ 0xffffffffffffffff) & param_1 | uVar2 & (param_1 ^ 0xffffffffffffffff)) *
          (-0x428f61f730924a05 - (-DAT_0027a358 ^ 0xffffffffffffffffU));
  uVar1 = (long)uVar2 >> ((-DAT_0027a358 | 0xd05eU) + (-DAT_0027a358 & 0xd05eU) & 0x3f);
  uVar2 = ((uVar1 ^ 0xffffffffffffffff) & uVar2 | uVar1 & (uVar2 ^ 0xffffffffffffffff)) *
          ((-DAT_0027a358 | 0x92e8a056c5b9e22eU) * 2 - (-DAT_0027a358 ^ 0x92e8a056c5b9e22eU));
  return ((long)uVar2 >> 0x1f | uVar2) & ((long)uVar2 >> 0x1f & uVar2 ^ 0xffffffffffffffff);
}


