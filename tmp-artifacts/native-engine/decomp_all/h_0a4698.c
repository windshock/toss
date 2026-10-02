// entry=0xa4698

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

void Ha45d8(undefined8 param_1)

{
  undefined **ppuVar1;
  ulong in_x12;
  long in_x13;
  
  if (in_x12 < 0x400 != (*(char *)(in_x13 + 1) == '\0') && in_x12 < 0x400) {
                    /* WARNING: Could not recover jumptable at 0x001a39b0. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)PTR_LAB_0027f288)(param_1);
    return;
  }
  ppuVar1 = &PTR_LAB_00277330;
  if (0x3fe < in_x12) {
    ppuVar1 = &PTR_LAB_002788c8;
  }
                    /* WARNING: Could not recover jumptable at 0x001ae568. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar1)(-DAT_0027fb18 & 0x2e00d84656e40bbf);
  return;
}


