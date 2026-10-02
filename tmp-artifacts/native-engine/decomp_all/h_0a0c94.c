// entry=0xa0c94

/* WARNING: Removing unreachable block (ram,0x001a3dbc) */
/* WARNING: Removing unreachable block (ram,0x001ae830) */
/* WARNING: Removing unreachable block (ram,0x001995b8) */
/* WARNING: Removing unreachable block (ram,0x0019cfdc) */
/* WARNING: Removing unreachable block (ram,0x001ac048) */
/* WARNING: Removing unreachable block (ram,0x001ac0dc) */
/* WARNING: Removing unreachable block (ram,0x0019cfd8) */
/* WARNING: Removing unreachable block (ram,0x001ad380) */
/* WARNING: Removing unreachable block (ram,0x00198be8) */
/* WARNING: Removing unreachable block (ram,0x001996b0) */
/* WARNING: Removing unreachable block (ram,0x00198664) */
/* WARNING: Removing unreachable block (ram,0x00199124) */
/* WARNING: Removing unreachable block (ram,0x001ae82c) */
/* WARNING: Recovered jumptable eliminated as dead code */

void Ha072c(undefined8 param_1)

{
  bool bVar1;
  undefined **ppuVar2;
  ulong in_x12;
  long in_x13;
  ulong in_x14;
  ulong uVar3;
  int in_w16;
  ulong uVar4;
  ulong uVar5;
  long unaff_x19;
  long unaff_x23;
  
  if ((in_x14 & 1) != 0) {
    uVar3 = (ulong)in_w16;
    uVar4 = uVar3;
    if (-1 < (long)uVar3) {
      uVar4 = 0;
    }
    uVar4 = (uVar3 ^ -uVar4) + (uVar3 & -uVar4) * 2;
    uVar5 = 0x3fe - (-in_x12 ^ 0xffffffffffffffff);
    if (uVar5 <= uVar4) {
      uVar4 = uVar5;
    }
    if (0xf < (uVar4 - ((-DAT_0027fb18 | 0x2e00d84656e407c1U) +
                        (-DAT_0027fb18 & 0x2e00d84656e407c1U) ^ 0xffffffffffffffff)) - 1) {
                    /* WARNING: Could not recover jumptable at 0x001acb34. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      (*(code *)PTR_LAB_002826c0)();
      return;
    }
    do {
      param_1 = 0xffffffffffffffff;
      *(undefined1 *)
       (unaff_x23 + (0x2e00d84656e407bf - (-DAT_0027fb18 ^ 0xffffffffffffffffU)) * 0x400 + in_x12) =
           *(undefined1 *)(*(long *)(unaff_x19 + 0x270) + uVar3);
      uVar4 = (-DAT_0027fb18 | 0x2e00d84656e407c1U) * 2 - (-DAT_0027fb18 ^ 0x2e00d84656e407c1U);
      in_x12 = (in_x12 | uVar4) * 2 - (in_x12 ^ uVar4);
      bVar1 = 0 < (long)uVar3;
      uVar3 = (uVar3 - ((-DAT_0027fb18 ^ 0x2e00d84656e407bfU) +
                        (-DAT_0027fb18 & 0x2e00d84656e407bfU) * 2 ^ 0xffffffffffffffff)) - 1;
    } while (bVar1 != 0x3ff < in_x12 && bVar1);
  }
  if (in_x12 < 0x400 == (*(char *)(in_x13 + 1) == '\0') || in_x12 >= 0x400) {
    ppuVar2 = &PTR_LAB_00277330;
    if (0x3fe < in_x12) {
      ppuVar2 = &PTR_LAB_002788c8;
    }
                    /* WARNING: Could not recover jumptable at 0x001ae568. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)*ppuVar2)(-DAT_0027fb18 & 0x2e00d84656e40bbf);
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x001a39b0. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR_LAB_0027f288)(param_1);
  return;
}


