// entry=0xd0c54

void Hd0c54(void)

{
  ulong in_x10;
  ulong in_x11;
  long *in_x12;
  ulong in_x13;
  ulong uVar1;
  ulong uVar2;
  ulong uVar3;
  ulong unaff_x23;
  
  uVar1 = (-DAT_00283df0 | 0x76c1d50315b28a1aU) + (-DAT_00283df0 & 0x76c1d50315b28a1aU);
  do {
    uVar2 = *(ulong *)(*in_x12 + uVar1 * 0x38 + 0x10);
    uVar2 = (uVar2 | unaff_x23) + (uVar2 & unaff_x23);
    uVar3 = *(ulong *)(*in_x12 + uVar1 * 0x38 + 0x28);
    uVar2 = (uVar2 ^ uVar3) + (uVar2 & uVar3) * 2;
    uVar3 = (in_x11 | in_x10) & (in_x11 & in_x10 ^ 0xffffffffffffffff);
    if (uVar3 <= uVar2) {
      uVar3 = uVar2;
    }
    in_x11 = (uVar3 | in_x10) & (uVar3 & in_x10 ^ 0xffffffffffffffff);
    uVar1 = (uVar1 | 1) * 2 - (uVar1 ^ 1);
  } while (uVar1 != (in_x13 & 0xffff));
                    /* WARNING: Could not recover jumptable at 0x001d0690. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR_LAB_0027a638)();
  return;
}


